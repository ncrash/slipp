## v0.16.2:

The following changes were originally released as 0.16.0, but the
README incorrectly referred to the maven# recipes, which are now
removed.

### Task

- [COOK-1874]: refactor maven default recipe to use version attributes

### Bug

- [COOK-2770]: maven cookbook broken for maven3 now that maven 3.0.5
  has been released

## v0.15.0:

* [COOK-1336] - Make Transitive Flag Configurable

## v0.14.0:

* [COOK-2191] - maven3 recipe's "version" doesn't match the attributes
* [COOK-2208] - Add 'classifier' attribute to maven cookbook

## v0.13.0:

* [COOK-2116] - maven should be available on the path

## v0.12.0:

* [COOK-1860] - refactor maven provider to use resources and `shell_out`

## v0.11.0:

* [COOK-1337] - add put action to maven lwrp to control name of the
  downloaded file
* [COOK-1657] - fix download urls

## v0.3.0:

* [COOK-1145] - maven lwrp to download artifacts
* [COOK-1196] - convert lwrp attributes to snake_case
* [COOK-1423] - check version attribute in default recipe

## v0.2.0:

* [COOK-813] - installs maven2 and maven3 using the binaries from maven.apache.org
