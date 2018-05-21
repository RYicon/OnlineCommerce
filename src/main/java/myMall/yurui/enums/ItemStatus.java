package myMall.yurui.enums;

/**
 * @author RY 
 * 商品状态
 */
public enum ItemStatus {
	InSale(1, "售卖中"), OutSold(2, "已下架"), Delete(3, "已删除"), Uploaded(0, "预售中");
	private Integer index;
	private String name;

	private ItemStatus(Integer index, String name) {

		this.index = index;
		this.name = name;
	}

	// 普通方法
	public static String getName(Integer index) {
		for (ItemStatus val : ItemStatus.values()) {
			if (val.getIndex() == index) {
				return val.name;
			}
		}
		return null;
	}

	// 普通方法
	public static Integer getIndex(String name) {
		if (name == null || name.trim() == null)
			return 9;

		for (ItemStatus val : ItemStatus.values()) {
			if (name.equals(val.getName())) {
				return val.index;
			}
		}
		return null;
	}

	// get set
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
