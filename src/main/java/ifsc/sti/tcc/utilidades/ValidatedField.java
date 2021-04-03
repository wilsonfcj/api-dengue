package ifsc.sti.tcc.utilidades;

public class ValidatedField {
	private String msm;
	private Boolean success;
	
	public ValidatedField(String msm, Boolean success) {
		super();
		this.msm = msm;
		this.success = success;
	}

	public String getMsm() {
		return msm;
	}

	public void setMsm(String msm) {
		this.msm = msm;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
}