# FookCalc

[![License MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=flat)](https://github.com/ibrahim-ekinci/FookCalc/blob/master/LICENSE)
[![Public Yes](https://img.shields.io/badge/Public-yes-green.svg?style=flat)](https://github.com/ibrahim-ekinci/FookCalc)
[![](https://jitpack.io/v/ibrahim-ekinci/FookCalc.svg)](https://jitpack.io/#ibrahim-ekinci/FookCalc)
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
<a href = "https://github.com/iamjosephmj/flinger/stargazers"><img src = "https://img.shields.io/github/stars/ibrahim-ekinci/FookCalc" /></a>

## What is FookCalc?
<p>  
A library for calculating on string data.
</p>

## Gradle

Add the following to your project's root build.gradle file

```groovy
repositories {
    maven {
        url "https://jitpack.io"
    }
}
```

Add the following to your project's build.gradle file

```groovy
dependencies {
    implementation 'com.github.ibrahim-ekinci:FookCalc:1.1.3'
}
```

## Usage
### Kotlin
```kotlin
Fook.calc("44+4")//It will return 48 as a double.
//or
"44+4".calculate()//It will return 48 as a double.(string extension)
```

### Java
```java
Fook.calc("44+4");//It will return 48 as a double.
```
## Abilities

### Constants
```kotlin

"π".calculate() //It will return 3.14159265358979323846
"e".calculate() //It will return 2.7182818284590452354
"φ".calculate() //It will return 1.6180339887
"-4".calculate() //It will return -4
"+4".calculate() //It will return +4
```

### Operations
```kotlin

"44-4".calculate() //It will return 40
"44+4".calculate() //It will return 48
"44*4".calculate() //It will return 176
"44/4".calculate() //It will return 11
"80%20".calculate() //It will return 16(20 percent of 80)
"2^4".calculate() //It will return 16(2 to the power of 4)
```
### Functions
```kotlin

"sqrt(4)".calculate() //It will return root of 4
"√(4)".calculate() //It will return root of 4 
"ln(4)".calculate() //It will return ln of 4
"log(4)".calculate() //It will return log 10 of 4
"abs(-4)".calculate() //It will return 4(absolute value)
"sin()".calculate() //It will return sine of 40
"cos(40)".calculate() //It will return cosine of 40
"tan(40)".calculate() //It will return tangent of 40
"cot(40)".calculate() //It will return cotangent of 40
"asin(40)".calculate() //It will return arc sine of 40
"acos(40)".calculate() //It will return arc cosine of 40
"atan(40)".calculate() //It will return arc tangent of 40 
"acot(40)".calculate() //It will return arc cotangent of 40
"sinh(40)".calculate() //It will return sine hyperbolic of 40
"cosh(40)".calculate() //It will return cosine hyperbolic of 40
"tanh(40)".calculate() //It will return tangent hyperbolic of 40
"coth(40)".calculate() //It will return cotangent hyperbolic of 40
//** NOTE: Calculated by converting trigonometric functions to radians. **
```

### Extras
Brackets: You can just use standard parentheses. There is no limit to the use of parentheses.<br>
Decimal numbers: You can show the fraction with a dot(".").
```kotlin

"((3.5124)+(5.3))*(2+6.7)".calculate() //It will return 76.66788
```

### Example
```kotlin

"((4 - 2^3 + 1) * -sqrt(3 * 3 + 4 * 4)) / 2 + ln(π)".calculate() //It will return 8.6447298858494
"((4-2^3+1)*-sqrt(3*3+4*4))/2+ln(π)".calculate() //It will return 8.6447298858494
```
## Formula Book
This library is used in the basic calculations of the <a href = "https://play.google.com/store/apps/details?id=com.gloorystudio.fook">Formula Book</a> application supported by <a href = "https://www.tubitak.gov.tr/">TÜBİTAK</a>.
<br>
<a href="https://play.google.com/store/apps/details?id=com.gloorystudio.fook"><img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" alt="Download on Google Play" height="80"></a>
## Contribution, Issues or Future Ideas

If part of FookCalc is not working correctly be sure to file a Github issue. In the issue provide as
many details as possible. This could include example code or the exact steps that you did so that
everyone can reproduce the issue. Sample projects are always the best way :). This makes it easy for
our developers or someone from the open-source community to start working!

If you have a feature idea submit an issue with a feature request or submit a pull request and we
will work with you to merge it in!

License
=======

    The MIT License (MIT)

    Copyright (c) 2021 Halil ibrahim EKİNCİ

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
