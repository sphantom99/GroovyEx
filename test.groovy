

def x = (0..30).toArray()
print x
techs = ["zero","one","two","three"]
println techs.get(0)


class Test implements GroovyInterceptable {
    def sum(Integer x, Integer y) {return (x + y) }

    def invokeMethod(String name, args) {
        System.out.println "Invoke method $name with args: $args"
    }
}

def test = new Test()
def res
res = test?.sum(2,3)
println res
res = test?.multiply(2,3)
println res