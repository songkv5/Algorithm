/**
	 * algorithm explanation:quick sort
	 * The algorithm design is,use one of its elements as the demarcation point,make the elements which is smaller than it location to its left,and the biggers to its right,the use recurse.
	 * use this array {10,15,4,9,7,18,25,1,7} as example.
	 * The 1st time for the sort,the result is 7 1 4 9 7 10 25 18 15 ,with choosing 10 as the demarcation point.
	 * Then the array is devided into 2 small arrays:array 1 with 7 1 4 9 7 10,and array 2 with 25 18 15.
	 * Then recurse call the method for these 2 arrays.
	 * 
	 * 以第一个元素10作为分界点并暂存于变量中。分别让i(左指针)和j(右指针)指向2数组的起止元素。
	 * 第一遍排序，比较分界点和右指针指向元素，若分界点<右指针指向元素，右指针左移。若分界点>右指针指向元素,将左指针指向的元素=右指针元素。
	 * 即数组变成{7,15,4,9,7,18,25,1,7}，此时10不数组当中，没关系，已经暂存于中将变量中。那此时右指针指向的元素7就是重复的了，那么要把它
	 * 替换掉。则之用一个比分界点元素大的元素替换掉他就可以。而这个比分界点元素大的元素是通过将左指针左移发现的，当找到后。只要用右指针元素=指针指向的元素。
	 * 
	 * 
	 */
	public void quicksort3(int[] array , int left , int right){
		
		if(left < right){//递归终止条件
			int i = left, j = right ;
			int tmp = array[left];
			while(i<j){
				while(tmp <= array[j] &&i < j){
					j--;
				}
				if(tmp > array[j]&&i<j){
					array[i]=array[j];
				}
				while(tmp >=array[i] && i < j){
					i ++;
				}
				if(tmp < array[i]&&i<j){
					array[j] = array[i];
				}
			}
			System.out.println("left=" + left);
			System.out.println("right=" +right );
			array[i] = tmp;
			quicksort3(array , left , i);
			quicksort3(array , i+1 , right);
		}
	}
