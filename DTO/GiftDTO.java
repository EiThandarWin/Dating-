package DTO;

public class GiftDTO {
	
	private String g_id;
	private String g_name;
	private String g_icon;
	private int g_cost;
	private int g_exp;
	
	public GiftDTO(String g_id, String g_name, String g_icon, int g_cost, int g_exp) {
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_icon = g_icon;
		this.g_cost = g_cost;
		this.g_exp = g_exp;
	}

	public String getG_id() {
		return g_id;
	}

	public void setG_id(String g_id) {
		this.g_id = g_id;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getG_icon() {
		return g_icon;
	}

	public void setG_icon(String g_icon) {
		this.g_icon = g_icon;
	}

	public int getG_cost() {
		return g_cost;
	}

	public void setG_cost(int g_cost) {
		this.g_cost = g_cost;
	}

	public int getG_exp() {
		return g_exp;
	}

	public void setG_exp(int g_exp) {
		this.g_exp = g_exp;
	}

}
