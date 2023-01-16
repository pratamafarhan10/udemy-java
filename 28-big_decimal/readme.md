# Big decimal vs double

When precision is really really important you should favor big decimal in immutable object over a double type.

Double is a binary floating type and that means not all the decimals can be represented accurately. This can cause unexpected result when performing math calculation. In the world of finance, engineering, and data analysis you wanna be as precise as possible.

When you're dealing with money and sensitive data you should favor big decimal over double.