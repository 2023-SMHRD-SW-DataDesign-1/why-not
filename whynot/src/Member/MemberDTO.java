package Member;

public class MemberDTO {
	private String id;
	private String pw;
	private String nickname;
	private int point;

	public MemberDTO(String id, String pw, String nickname) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;

	}

	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String id, String pw, String nickname, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.point = point;
	}

	public MemberDTO(int point) {
		super();
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}