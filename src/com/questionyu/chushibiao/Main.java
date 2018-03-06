package com.questionyu.chushibiao;

public class Main {

	public static void main(String[] args) {
		君 先帝 = new 君();
		君 陛下 = new 君();
		君 文景 = new 君();
		君 桓灵 = new 君();
		国 曹魏 = new 国();
		国 东吴 = new 国();
		国 益州 = new 国();
		国 先汉 = new 国();
		国 后汉 = new 国();
		侍中 侍中 = new 侍中();
		侍郎 侍郎 = new 侍郎();
		尚书 尚书 = new 尚书();
		长史 长史 = new 长史();
		参军 参军 = new 参军();
		中都督 中都督 = new 中都督();
		丞相 丞相 = new 丞相();


		先帝.创业(0.49);
		益州.国运 = 气候.疲敝;
		System.out.println("此诚危急存亡之秋也！");
		if (侍中.郭攸之.追先帝之殊遇() && 侍中.郭攸之.报之于陛下()) {
			侍中.郭攸之.不懈于内();
		}
		if (侍中.费祎.追先帝之殊遇() && 侍中.费祎.报之于陛下()) {
			侍中.费祎.不懈于内();
		}
		if (侍郎.董允.追先帝之殊遇() && 侍郎.董允.报之于陛下()) {
			侍郎.董允.不懈于内();
		}
		if (中都督.向宠.追先帝之殊遇() && 中都督.向宠.报之于陛下()) {
			中都督.向宠.忘身于外();
		}
		if (陛下.为君 == 王道.明) {
			陛下.开张圣听();
			陛下.恢弘志士之气();
		} else {
			陛下.妄自菲薄();
			陛下.引喻失义();
		}
		陛下.治国();
		boolean 宫中 = false;
		boolean 府中 = false;
		boolean 陟臧 = false;
		boolean 罚否 = false;
		assert (宫中 == 府中);
		assert (陟臧 == 罚否);

		侍卫之臣 作奸犯科者 = new 侍卫之臣();
		作奸犯科者.为臣 = 臣德.奸;
		侍卫之臣 为忠善者 = new 侍卫之臣();
		为忠善者.为臣 = 臣德.贤;
		if (陛下.为君 == 王道.明) {
			益州.付诸有司论其刑赏(作奸犯科者);
			益州.付诸有司论其刑赏(为忠善者);
		} else {
			陛下.偏私();
		}

		if (侍中.郭攸之.为臣 == 臣德.贤 && 侍中.费祎.为臣 == 臣德.贤 && 侍郎.董允.为臣 == 臣德.贤) {
			System.out.println("此皆良实，志虑忠纯，是以先帝简拔以遗陛下。");
		}

		事 宫中之事 = new 事();
		if (陛下.咨之(宫中之事) && 侍中.郭攸之.谋事(宫中之事) && 侍中.费祎.谋事(宫中之事) && 侍郎.董允.谋事(宫中之事)) {
			陛下.施行(宫中之事);
			System.out.println("裨补阙漏，有所广益!");
		}

		if (中都督.向宠.为臣 == 臣德.贤) {
			System.out.println("性行淑均，晓畅军事。");
			System.out.println("先帝称之曰：");
			先帝.曰("能");
			System.out.println("是以众议举宠为督。");
		}

		事 营中之事 = new 事();
		if (陛下.咨之(营中之事)) {
			陛下.施行(营中之事);
			System.out.println("行阵和睦，优劣得所!");
		}

		文景.亲贤臣远小人();
		先汉.国运 = 气候.兴隆;
		桓灵.亲小人远贤臣();
		后汉.国运 = 气候.倾颓;

		do {
			先帝.每与臣论此事();
		} while (先帝.在);

		if (侍中.郭攸之.为臣 == 臣德.贤 && 侍中.费祎.为臣 == 臣德.贤 && 侍郎.董允.为臣 == 臣德.贤) {
			System.out.println("此悉贞良死节之臣，愿陛下亲之信之，则汉室之隆，可计日而待也。");
		}

		丞相.诸葛亮.回首往事();
		丞相.诸葛亮.表忠心();
		丞相.诸葛亮.请战();
		丞相.诸葛亮.道别();

	}

}

enum 王道 {明, 昏}

class 君 {

	boolean 在;

	王道 为君;

	君() {
		在 = true;
		为君 = 王道.明;
	}

	boolean 创业(double percentage) {
		if (percentage < 0.5) {
			在 = false;
			System.out.println("崩殂！");
			return false;
		} else {
			System.out.println("兴复汉室，还于旧都！");
			return true;
		}
	}

	void 开张圣听() {
		System.out.println("光先帝遗德！");
	}

	void 恢弘志士之气() {
	}

	void 妄自菲薄() {
	}

	void 引喻失义() {
		System.out.println("塞忠谏之路！");
	}

	void 亲贤臣远小人() {
		为君 = 王道.明;
	}

	void 亲小人远贤臣() {
		为君 = 王道.昏;
	}

	void 治国() {
	}

	void 偏私() {
		System.out.println("内外异法！");
	}

	boolean 咨之(事 事) {
		if (为君 == 王道.明) {
			return true;
		} else
			return false;
	}

	boolean 施行(事 事) {
		return true;
	}

	void 曰(String 言) {
		System.out.println(言);
	}

	void 每与臣论此事() {
		System.out.println("叹息痛恨于桓灵。");
	}
}

enum 臣德 {贤, 奸}

class 侍卫之臣 {
	君 刘备 = new 君();
	君 刘禅 = new 君();
	臣德 为臣;

	侍卫之臣() {

	}

	侍卫之臣(臣德 为臣) {
		this.为臣 = 为臣;
	}

	void 不懈于内() {
		System.out.println("不懈于内!");
	}

	boolean 追先帝之殊遇() {
		if (刘备.为君 == 王道.明)
			return true;
		else
			return false;
	}

	boolean 报之于陛下() {
		if (刘禅.为君 == 王道.明)
			return true;
		else
			return false;
	}

	boolean 谋事(事 事){
		if (刘禅.为君 == 王道.明)
			return true;
		else
			return false;
	}

	void 回首往事() {
		System.out.println("臣本布衣，躬耕于南阳，苟全性命于乱世，不求闻达于诸侯。先帝不以臣卑鄙，猥自枉屈，三顾臣于草庐之中，咨臣以当世之事，由是感激，遂许先帝以驱驰。后值倾覆，受任于败军之际，奉命于危难之间，尔来二十有一年矣。");
	}

	void 表忠心() {
		System.out.println("先帝知臣谨慎，故临崩寄臣以大事也。受命以来，夙夜忧叹，恐托付不效，以伤先帝之明，故五月渡泸，深入不毛。");
	}

	void 请战() {
		System.out.println("今南方已定，兵甲已足，当奖率三军，北定中原，庶竭驽钝，攘除奸凶，兴复汉室，还于旧都。");
	}

	void 道别() {
		System.out.println("今当远离，临表涕泣，不知所云。");
	}
}

enum 气候 {兴盛, 疲敝, 兴隆, 倾颓}

class 国 {
	气候 国运;

	国() {
		国运 = 气候.兴盛;
	}

	void 付诸有司论其刑赏(侍卫之臣 臣) {
		if (臣.为臣 == 臣德.贤)
			System.out.println("赏！");
		else
			System.out.println("刑！");
	}

}

class 忠志之士 {
	君 刘备 = new 君();
	君 刘禅 = new 君();
	臣德 为臣;

	忠志之士() {

	}

	忠志之士(臣德 为臣) {
		this.为臣 = 为臣;
	}

	void 忘身于外() {
		System.out.println("忘身于外!");
	}

	boolean 追先帝之殊遇() {
		if (刘备.为君 == 王道.明)
			return true;
		else
			return false;
	}

	boolean 报之于陛下() {
		if (刘禅.为君 == 王道.明)
			return true;
		else
			return false;
	}

	boolean 谋事(事 事){
		if (为臣 == 臣德.贤)
			return true;
		else
			return false;
	}
}

class 事 {

}

class 侍中 {
	侍卫之臣 郭攸之 = new 侍卫之臣(臣德.贤);
	侍卫之臣 费祎 = new 侍卫之臣(臣德.贤);
}

class 侍郎 {
	侍卫之臣 董允 = new 侍卫之臣(臣德.贤);
}

class 尚书 {
	侍卫之臣 陈震 = new 侍卫之臣(臣德.贤);
}

class 长史 {
	侍卫之臣 张裔 = new 侍卫之臣(臣德.贤);
}

class 参军 {
	侍卫之臣 蒋琬 = new 侍卫之臣(臣德.贤);
}

class 中都督 {
	忠志之士 向宠 = new 忠志之士(臣德.贤);
}

class 丞相 {
	侍卫之臣 诸葛亮 = new 侍卫之臣(臣德.贤);
}