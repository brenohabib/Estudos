#include <stdio.h>

int main() {

    int num [] = {1,2,3,4,5};

    for (int i = 0; i < (int) sizeof(num) / 4; i++) {
        printf("number: %i\n", num[i]);
    }
    

    return 0;
}
