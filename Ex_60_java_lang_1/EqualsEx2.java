package Ex_60_java_lang_1;

class Person{
	long id;

	public boolean equals(Object obj){
		if (obj instanceof Person)
			return this.id == ((Person) obj).id;
		else
			return false;
	}

	Person(long id){
		this.id = id;
	}
}

class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		System.out.println(p1 == p2);       // false
		System.out.println(p1.equals(p2));  // ture
	}
}
