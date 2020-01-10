package kh.init.members;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import kh.init.configuration.Configuration;

@Service
public class GuestService {

	@Autowired
	private MemberDAO dao;
	@Autowired
	private Configuration config;
	
	@Transactional("txManager")
	public int insert(MemberDTO dto, MultipartFile profile_img, String path) {
		File filePath = new File(path);
		if(!filePath.exists()) {
			filePath.mkdir();
		}
		System.out.println(profile_img);
		if(profile_img != null) {		
			String profile =  "/files/" + dto.getEmail() + "_profile_img.jpg";
			dto.setProfile_img(profile);
			try {
				profile_img.transferTo(new File(path + "/" + dto.getEmail() + "_profile_img.jpg"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			dto.setPw(config.encrypt(dto.getPw()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao.insert(dto);
	}
	
	public int checkEmail(String email) {
		return dao.checkEmail(email);
	}
	
	public int checkNickname(String nickname) {
		return dao.checkNickname(nickname);
	}
	
	public int checkPhone(String email) {
		return dao.checkPhone(email);
	}
	
	public String getProfile(String email) {
		return dao.getProfile(email);
	}
}
