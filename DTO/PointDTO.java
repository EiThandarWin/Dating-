package DTO;

public class PointDTO {
	
	private String u_id;
	private int total_point;
	private String point_history;
	
	public PointDTO(String u_id, int total_point, String point_history) {
		this.u_id = u_id;
		this.total_point = total_point;
		this.point_history = point_history;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public int getTotal_point() {
		return total_point;
	}

	public void setTotal_point(int total_point) {
		this.total_point = total_point;
	}

	public String getPoint_history() {
		return point_history;
	}

	public void setPoint_history(String point_history) {
		this.point_history = point_history;
	}

}
