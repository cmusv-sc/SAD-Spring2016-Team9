package models;

/**
 * Strategy context class
 * @author Qiaoyi Chen (qiaoyic)
 */

public class StrategyContext {

	private IStrategy model;

	public StrategyContext(IStrategy model) {
		this.model = model;
	}

	public String strategyToString() {
		return model.toString();
	}

	public long strategyGetId() {
		return model.getId();
	}

}
