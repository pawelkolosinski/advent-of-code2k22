package com.github.pawelkolosinski

import scala.io.Source

def mapCaloriesToSums(filename: String): Array[Int] =
	Source.fromFile(filename)
		.getLines()
		.mkString("\n")
		.split("\n\n")
		.map(arr => arr.split('\n').map(_.toInt).sum)

@main def main(args: String*): Unit =
	val sums = mapCaloriesToSums("src/resources/1.txt")
	println(sums.max)
	println(sums
		.sorted(Ordering[Int].reverse)
		.take(3)
		.sum)
