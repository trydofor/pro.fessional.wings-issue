# @Configuration vs @AutoConfiguration

autoconfigure only affects on Auto-Auto of bean definition

* `@AutoConfiguration` vs `@Configuration`
* `@AutoConfigureOrder` vs `@Order`
* `@ImportAutoConfiguration` vs `@Import`

## case1 work ✅

* `@ImportAutoConfiguration`
* `@AutoConfiguration` and `@AutoConfigureOrder`

## case2 work ✅

* `META-INF/..AutoConfiguration.imports`
* `@AutoConfiguration` and `@AutoConfigureOrder`

## case3 work ✅

* `META-INF/..AutoConfiguration.imports`
* `@Configuration` and `@AutoConfigureOrder`

## case4 NOT work ❌ vs case1

* `@ImportAutoConfiguration`
* `@Configuration` and `@AutoConfigureOrder` and `@Order`

## case5 NOT work ❌

* normal scan
* `@Configuration` and `@AutoConfigureOrder` and `@Order`

## case6 NOT work ❌ vs case1

* `@Import`
* `@AutoConfiguration` and `@AutoConfigureOrder` and `@Order`

## case7 NOT work ❌ vs case2

* `META-INF/..AutoConfiguration.imports`
* `@Configuration` and `@Order`

## case8 NOT work ❌ vs case6

* `@Import`
* `@Configuration` and `@AutoConfigureOrder` and `@Order`