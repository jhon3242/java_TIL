package Ex_49_self_study2;

import java.util.Arrays;
import java.util.Vector;

interface Lapable{
	void lapping();
}

public class Samsung {
	int scale; // 시가총액
	String cmp_name; // 회사이름
}

abstract class SamsungElect extends Samsung{
	String child_cmp_name;
	int department_size; // 부서수
	Vector items = new Vector(); // 제품 목록
	int product_size; // 제품 수
}

class Galexy extends SamsungElect  implements Lapable {
	String department_name; // 부서이름
	int team_size; // 팀원 수


	public void lapping() {};
}