package oop.modifier2;

public class ClassP {
	
		String classT; //타이틀
		int classD; //강의시간
		int courseF; // 수강료
		
		void setClssT ( String classT) {
			this.classT = classT;
		}
		
		void setClassD ( int classD) {
			if(classD%30 ==0) {
			this.classD = classD;
			}
		}
		
		void setCourseF ( int courseF){
			if(courseF > 0) { //0원보다 크다면
			this.courseF = courseF;
				}
			}
		
		
		String getClassT() {
			return this.classT;
		}
		int getClassD() {
			return this.classD;
		}
		int getCourseF() {
			return this.courseF;
		}
		float get1H() {
			return (float)(this.courseF /(float)this.classD );
		}
		
		void data(String classT, int classD, int courseF) {
			this.setClssT(classT);
			this.setClassD(classD);
			this.setCourseF(courseF);
		}
		void print() {
			System.out.println(getClassT());
			System.out.println(getClassD());
			System.out.println(getCourseF());
			System.out.println("1시간당" + get1H());
			System.out.println();
		}
		
		}
