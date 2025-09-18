int reverse(int x) {
    int number[32];
    int Count = 0;

    while (x != 0) {
        int digit = x % 10;
        number[Count++] = digit;
        x /= 10;
    }

    long long reversed = 0;
    for (int i = 0; i < Count; ++i) {
        if (reversed > INT_MAX / 10 || reversed < INT_MIN / 10) return 0;
        reversed = reversed * 10 + number[i];
    }
    return (int)reversed;
}