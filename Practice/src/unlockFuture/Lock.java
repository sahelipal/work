package unlockFuture;

public class Lock {
	private String lockModel;
	private int codeLength;
	private int[]code;
	private String lockState;
	public String getLockModel() {
		return lockModel;
	}
	public void setLockModel(String lockModel) {
		this.lockModel = lockModel;
	}
	public int getCodeLength() {
		return codeLength;
	}
	public void setCodeLength(int codeLength) {
		this.codeLength = codeLength;
	}
	public int[] getCode() {
		return code;
	}
	public void setCode(int[] code) {
		this.code = code;
	}
	public String getLockState() {
		return lockState;
	}
	public void setLockState(String lockState) {
		this.lockState = lockState;
	}
	public Lock(String lockModel, int codeLength, int[] code, String lockState) {
		super();
		this.lockModel = lockModel;
		this.codeLength = codeLength;
		this.code = code;
		this.lockState = lockState;
	}
	
	
	public String enterCodeToUnlock(int[]codeAttempts) {
		int count=0;
		if(lockState.equalsIgnoreCase("locked"))
		{
			for(int i=0;i<codeAttempts.length;i++) {
				if(codeAttempts[i]==code[i]) {
					count++;
				}
			}
			if(count==codeAttempts.length) {
				setLockState("unlocked");
				return "code is correct.unlocked";
			}
			else {
				return "Incorrect.try again.";
			}
		}
		else if(lockState.equalsIgnoreCase("unlocked")) {
			return "Lock is already unlocked";
		}
		return null;
	}
}
