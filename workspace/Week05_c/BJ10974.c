#include <stdio.h>

void pick(int n, int* bucket, int bucketSize, int k) { 
	int i, lastIndex, smallest, item;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++)
			printf("%d ", bucket[i] + 1);
		printf("\n");
		return;
	}

	lastIndex = bucketSize - k - 1; 
	smallest = 0;

	for (item = smallest; item < n; item++) {
	
		int chosen = 0, j;

		for (j = 0; j < bucketSize - k; j++) {
			if (item == bucket[j]) {
				chosen = 1;
				break;
			}
		}

		if (!chosen) {
			bucket[lastIndex + 1] = item;
			pick(n, bucket, bucketSize, k - 1);
		}
	}
}

int main(void) {
	int n;
	int *bucket;
	
	scanf("%d", &n);
	bucket = (int*)malloc(sizeof(int) * n);
	pick(n, bucket, n, n);
}


