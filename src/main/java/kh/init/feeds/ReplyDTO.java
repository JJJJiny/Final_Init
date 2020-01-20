package kh.init.feeds;

import java.sql.Timestamp;

public class ReplyDTO {
	private int feed_seq;
	private int reply_seq;
	private String email;
	private int	depth;
	private int parent;
	private String contents;
	private Timestamp write_date;
	public ReplyDTO() {
		super();
	}
	public ReplyDTO(int feed_seq, int reply_seq, String email, int depth, int parent, String contents,
			Timestamp write_date) {
		super();
		this.feed_seq = feed_seq;
		this.reply_seq = reply_seq;
		this.email = email;
		this.depth = depth;
		this.parent = parent;
		this.contents = contents;
		this.write_date = write_date;
	}
	public int getFeed_seq() {
		return feed_seq;
	}
	public void setFeed_seq(int feed_seq) {
		this.feed_seq = feed_seq;
	}
	public int getReply_seq() {
		return reply_seq;
	}
	public void setReply_seq(int reply_seq) {
		this.reply_seq = reply_seq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Timestamp getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}
	@Override
	public String toString() {
		return "ReplyDTO [feed_seq=" + feed_seq + ", reply_seq=" + reply_seq + ", email=" + email + ", depth=" + depth
				+ ", parent=" + parent + ", contents=" + contents + ", write_date=" + write_date + "]";
	}
	
	
	
	
}
