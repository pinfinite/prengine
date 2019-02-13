package com.pinfinite.prengine.model.constansts;

public enum Rank {

	TYPE(1),CATEGORY(2),TITLE(4),COLOUR(3);
	
	private int rankNo;
	
	private Rank(int rankNo) {
		this.rankNo=rankNo;
	}
	
}
