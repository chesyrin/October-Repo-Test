#include <iostream>

int friendliness(int test_number);

int main() {

	std::cout<<friendliness(9)<<std::endl;
	std::cout<<friendliness(150);
	return 0;
}

int friendliness(int test_number){
	int count_friend{0};
	int starting_number{1};

	while (starting_number * 2 <= test_number){
		int add_loop_counter{starting_number};
		int sum{0};

		while(sum < test_number){
			sum = sum + add_loop_counter;
			add_loop_counter++;
		}
		if (sum == test_number){
			count_friend++;
		}
		starting_number++;
	}

	return count_friend;
}
