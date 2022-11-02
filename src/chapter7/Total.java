package chapter7;

class Total {
	int sum;
	
	public Total(int num){
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		this.sum = sum;
	}
	
	int getSum() {
		return sum;
	}
}
