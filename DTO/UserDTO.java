package DTO;

public class UserDTO {
	private String u_id;
	private String u_name;
	private String email;
	private String password;
	private String birthdate;
	private String gender;
	private String bio;
	private String location;
	private String profile;
	private String religious;
	private String education;
	private String job;
	private String lifestyle;
	private String habit;
	private String language;
	private String mbti;
	private String hideflag;
	public UserDTO(String u_id, String u_name, String email, String password, String birthdate, String gender,
			String bio, String location, String profile, String religious, String education, String job,
			String lifestyle, String habit, String language, String mbti, String hideflag) {
		
		this.u_id = u_id;
		this.u_name = u_name;
		this.email = email;
		this.password = password;
		this.birthdate = birthdate;
		this.gender = gender;
		this.bio = bio;
		this.location = location;
		this.profile = profile;
		this.religious = religious;
		this.education = education;
		this.job = job;
		this.lifestyle = lifestyle;
		this.habit = habit;
		this.language = language;
		this.mbti = mbti;
		this.hideflag = hideflag;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getReligious() {
		return religious;
	}
	public void setReligious(String religious) {
		this.religious = religious;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLifestyle() {
		return lifestyle;
	}
	public void setLifestyle(String lifestyle) {
		this.lifestyle = lifestyle;
	}
	public String getHabit() {
		return habit;
	}
	public void setHabit(String habit) {
		this.habit = habit;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMbti() {
		return mbti;
	}
	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	public String getHideflag() {
		return hideflag;
	}
	public void setHideflag(String hideflag) {
		this.hideflag = hideflag;
	}
	
}
