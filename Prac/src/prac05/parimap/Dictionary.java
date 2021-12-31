package prac05.parimap;

public class Dictionary extends PairMap {
	int num;
	int init = 0;
	
	public Dictionary(int num) {
		this.keyArray = new String[num];
		this.valueArray = new String[num];
		this.num = num;
	}

	@Override
	String get(String key) {
		for(int i=0; i<this.length(); i++) {
			if(keyArray[i] != null && keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		int count = 0;
		for(int i=0; i<this.length(); i++) {
			if(this.keyArray[i].equals(key)) {
				this.valueArray[i] = value;
				init--;
				count++;
				break;
			}
		}
		if(count == 0) {
			int a = init++;
			this.keyArray[a] = key;
			this.valueArray[a] = value;
		}
		
	}

	@Override
	String delete(String key) {
		for(int i = 0; i<this.length(); i++) {
			if(this.keyArray[i].equals(key)) {
				this.keyArray[i] = null;
				this.valueArray[i] = null;
			}
		}
		return null;
	}

	@Override
	int length() {
		int len = 0;
		for(int i = 0; i<this.num; i++) {
			if(this.keyArray[i] != null) {
				len++;
			}
		}
		return len;
	}

}
