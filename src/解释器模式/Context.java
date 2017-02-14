package 解释器模式;
/*
 * 包含解释器之外的一些全局信息。
 */
public class Context {
	private String input;
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}

	private String output;
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
}
