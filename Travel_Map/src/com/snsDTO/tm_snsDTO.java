package com.snsDTO;

public class tm_snsDTO {

	private int tb_seq;
	private String tb_title;
	private String tb_content;
	private String tb_file;
	private int tb_cnt;
	private int tb_likes;
	private int tb_total;
	private String tb_open;
	private String mb_id;
	private String t_title;

	private boolean check;
	private int follow;
	private String log_type;
	private String mb_nickname;
	private String mb_img;

	public String getLog_type() {
		return log_type;
	}

	public String getT_title() {
		return t_title;
	}

	public void setT_title(String t_title) {
		this.t_title = t_title;
	}

	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}

	public String getMb_nickname() {
		return mb_nickname;
	}

	public void setMb_nickname(String mb_nickname) {
		this.mb_nickname = mb_nickname;
	}

	public String getMb_img() {
		return mb_img;
	}

	public void setMb_img(String mb_img) {
		this.mb_img = mb_img;
	}

	public int getTb_seq() {
		return tb_seq;
	}

	public void setTb_seq(int tb_seq) {
		this.tb_seq = tb_seq;
	}

	public String getTb_title() {
		return tb_title;
	}

	public void setTb_title(String tb_title) {
		this.tb_title = tb_title;
	}

	public String getTb_content() {
		return tb_content;
	}

	public void setTb_content(String tb_content) {
		this.tb_content = tb_content;
	}

	public String getTb_file() {
		return tb_file;
	}

	public void setTb_file(String tb_file) {
		this.tb_file = tb_file;
	}

	public int getTb_cnt() {
		return tb_cnt;
	}

	public void setTb_cnt(int tb_cnt) {
		this.tb_cnt = tb_cnt;
	}

	public int getTb_likes() {
		return tb_likes;
	}

	public void setTb_likes(int tb_likes) {
		this.tb_likes = tb_likes;
	}

	public int getTb_total() {
		return tb_total;
	}

	public void setTb_total(int tb_total) {
		this.tb_total = tb_total;
	}

	public String getTb_open() {
		return tb_open;
	}

	public void setTb_open(String tb_open) {
		this.tb_open = tb_open;
	}

	public String getMb_id() {
		return mb_id;
	}

	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}

	public tm_snsDTO(String mb_id, String t_title) {
		super();
		this.mb_id = mb_id;
		this.t_title = t_title;
	}

	public tm_snsDTO(int tb_seq, String tb_title, String tb_content, String tb_file, int tb_cnt, int tb_likes,
			int tb_total, String tb_open, String mb_id, String t_title) {
		this.tb_seq = tb_seq;
		this.tb_title = tb_title;
		this.tb_content = tb_content;
		this.tb_file = tb_file;
		this.tb_cnt = tb_cnt;
		this.tb_likes = tb_likes;
		this.tb_total = tb_total;
		this.tb_open = tb_open;
		this.mb_id = mb_id;
		this.t_title = t_title;
	}

	public tm_snsDTO(String mb_id) {
		this.mb_id = mb_id;
	}

	public tm_snsDTO(int tb_seq) {
		this.tb_seq = tb_seq;
	}

	public tm_snsDTO() {
	}

	public tm_snsDTO(String tb_title, String tb_content, String tb_file, String mb_id) {
		this.tb_title = tb_title;
		this.tb_content = tb_content;
		this.tb_file = tb_file;
		this.mb_id = mb_id;
	}

	public tm_snsDTO(String tb_title, String tb_file, int tb_cnt, int tb_likes) {
		this.tb_title = tb_title;
		this.tb_file = tb_file;
		this.tb_cnt = tb_cnt;
		this.tb_likes = tb_likes;
	}

	public tm_snsDTO(int tb_seq, String tb_file, String tb_open, String mb_id, String t_title) {
		this.tb_seq = tb_seq;
		this.tb_file = tb_file;
		this.tb_open = tb_open;
		this.mb_id = mb_id;
		this.t_title = t_title;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getFollow() {
		return follow;
	}

	public void setFollow(int follow) {
		this.follow = follow;
	}

	public void follower(boolean check, int follow) {
		this.check = check;
		this.follow = follow;
	}

	public tm_snsDTO(int tb_seq, String tb_title, String tb_file, int tb_cnt, int tb_likes) {
		super();
		this.tb_seq = tb_seq;
		this.tb_title = tb_title;
		this.tb_file = tb_file;
		this.tb_cnt = tb_cnt;
		this.tb_likes = tb_likes;
	}

	public tm_snsDTO(int tb_seq, String tb_file) {
		this.tb_seq = tb_seq;
		this.tb_file = tb_file;
	}

	public tm_snsDTO(int tb_seq, String tb_file, String mb_id) {
		this.tb_seq = tb_seq;
		this.tb_file = tb_file;
		this.mb_id = mb_id;
	}

	public tm_snsDTO(String mb_id, String log_type, int tb_seq, String mb_nickname, String mb_img) {
		this.mb_id = mb_id;
		this.log_type = log_type;
		this.tb_seq = tb_seq;
		this.mb_nickname = mb_nickname;
		this.mb_img = mb_img;
	}
	
	

}
