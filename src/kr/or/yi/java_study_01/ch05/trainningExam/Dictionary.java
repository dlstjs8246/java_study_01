package kr.or.yi.java_study_01.ch05.trainningExam;

public class Dictionary extends PairMap {
	String[] keyArr;
	String[] valueArr;
	private int length;
	
	public Dictionary(int length) {
		keyArr = new String[length];
		valueArr = new String[length];
	}

	@Override
	String get(String Key) {
		// TODO Auto-generated method stub
		int getIdx = findIdx(Key);
		if(getIdx==-1) {
			return null;
		}
		return valueArr[getIdx];
	}

	@Override
	void put(String key, String value) {
		int findIdx = findIdx(key);
		if(findIdx!=-1) {
			if(keyArr[findIdx]==key) {
				valueArr[findIdx] = value;
				return;
			}
		}
		keyArr[length] = key;
		valueArr[length] = value;
		length++;
	}

	private int findIdx(String key) {
		int findIdx = 0;
		for(int i=0;i<keyArr.length;i++) {
			if(keyArr[i]==key) {
				findIdx = i;
				return findIdx;
			}
		}
		return -1;
	}

	@Override
	String delete(String key) {
		int delIdx = findIdx(key);
		if(delIdx==-1) {
			return null;
		}
		String[] tmp = new String[keyArr.length];
		keyArr[delIdx] = null;
		valueArr[delIdx] = null;
		keyArr = deleteArr(tmp,keyArr,delIdx);
		valueArr = deleteArr(tmp,valueArr,delIdx);
		return valueArr[delIdx];
	}

	String[] deleteArr(String[] tmp, String[] targetArr, int delIdx) {
		if(delIdx+1>1) {
			System.arraycopy(targetArr, 0, tmp, 0, delIdx);
			System.arraycopy(targetArr, delIdx+1, tmp, delIdx, targetArr.length);
			return tmp;
		}
		System.arraycopy(targetArr, 0, tmp, 0, delIdx);
		return tmp;
		
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return length;
	}

}
