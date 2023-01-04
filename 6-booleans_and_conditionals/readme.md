# Boolean and Conditional

in boolean Java only allocated 1 bit to memory because it only stores true or false.

Comparisons operator:
- >
- <
- >=
- <=
- ==
- !=
- equals method for string

**Never use == or != to compare string, you will get weird results**

# Conditional

- If else is more flexible to use while switch statement used only when we have certain cases

# Delimiter

Delimiter reads the white space, no matter how many space do you enter it always reads the input.

for example: 20     560    10

the scanner will read 20, 560, and 10 with 3 nextInt()

nextLine() will read the whole line including the white space.

## nextLine() Trap

nextLine() will not read anything after next(), nextInt(), nextDouble(), or nextLong() because these methods doesn't move into a new line.

-> nextInt()
-> nextLine()

-> 20........................... nextInt() will read the 20, but the nextLine() will read the rest of the line which is white space.
-> // input sentence here

So to solve this we have to call nextLine() before scan the text so

-> nextInt()
-> nextLine()
-> nextLine()

-> 20........................... // nextInt() will read the 20, but the nextLine() will read the rest of the line which is white space.
-> I love java // this line will be read