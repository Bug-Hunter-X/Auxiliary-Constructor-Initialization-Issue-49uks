# Scala Auxiliary Constructor Bug

This repository demonstrates a common error related to auxiliary constructors in Scala.  The provided `MyClass` example showcases a scenario where the auxiliary constructor does not correctly initialize the `value` member.

## Bug Description
The main constructor initializes `value` properly. However, the auxiliary constructor, intended to provide a default value, does not properly call the main constructor resulting in unexpected behavior.

## Solution
The solution involves correctly invoking the main constructor from the auxiliary constructor, ensuring proper initialization of all members.