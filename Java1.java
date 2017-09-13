public class Java1 {
	public static void main(String[] args) {
		int sort[] = { 6, 3, 8, 5, 2, 4 };

		int temp = 0;
		for (int i = 1; i < sort.length; ++i) {
			int j = i - 1;
			temp = sort[i];
			for (; j >= 0 && temp < sort[j]; ++j) {
				sort[j + 1] = sort[j];
				sort[j + 1] = temp;
			}
		}
		for (int i : sort)
			System.out.println(i);
	}
}