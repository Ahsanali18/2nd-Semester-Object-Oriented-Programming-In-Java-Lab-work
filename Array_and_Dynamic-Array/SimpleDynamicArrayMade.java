package Arrays;

class MakeDynamicArray{
	int size;
	int [] array;
	int count;
	
	public MakeDynamicArray() {
		this.size=1;
		this.array=new int[size];
		this.count=0;
	}
	public void checkAndGrow() {
		if(this.size==this.count) {
			int [] tempArray= new int[size*2];
			for(int i=0; i<count;i++) {
				tempArray[i]=array[i];
			}
			array=tempArray;
			size*=2;
		}
	}
	public void insert(int value) {
		checkAndGrow();
		array[count]=value;
		count++;
	}
	public void print() {
		for(int arr:array) {
			System.out.print(arr+" ");
		}
	}
}
public class SimpleDynamicArrayMade {
	
	public static void main(String[] args) {
		MakeDynamicArray mda=new MakeDynamicArray();
		mda.insert(2);
		mda.insert(3);
		mda.insert(4);
		mda.insert(7);
		mda.insert(9);  // 0 0 0 displays at last on console because size become double at above that's why 4*2=8
		mda.print();
	}
}
