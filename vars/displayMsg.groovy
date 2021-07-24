import groovy.transform.Field
@Field def num = 10

def call() {
  println(globalVars.msg1)
  println(globalVars.dir)
  globalVars.dir = 2
  println(globalVars.dir)
  println(num)
}
