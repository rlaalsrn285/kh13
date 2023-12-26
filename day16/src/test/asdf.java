package test;

public class asdf {
		private String name;
		private int age;
		private String job;
		
		asdf(String name, int age){
			this(name,age,"무직");
		}
		
		asdf(String name, int age, String job){
			this.setName(name);
			this.setAge(age);
			this.setJob(job);
		}
		
		public String getName() {
			return name;
		}

		private void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		private void setAge(int age) {
			if(age < 1) return;
			this.age = age;
		}

		public String getJob() {
			return job;
		}

		private void setJob(String job) {
			this.job = job;
		}
		
		public String getAgeCate() {
			if(this.age >= 20 ) {
				return "성인";
			}
			else if(this.age >= 14 ) {
				return "청소년";
			}
			else if(this.age >= 8) {
				return "어린이";
			}
			else {
				return "유아";
			}
		}
			void print() {
				System.out.print("이름" + getName() );  //요구사항에 없는 정보
				System.out.println ("나이" + getAge()); //요구사항에 없는 정보
				System.out.println(getAgeCate()  );
			}
}