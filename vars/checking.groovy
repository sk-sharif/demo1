name = "sharif"

def call(Map config = [:]) {
    echo "checking stage 1 Checked ${name}"
}

def calling(Map config = [:]) {
    echo "checking stage 2 Checked ${name}"
}

def calling1(Map config = [:]) {
    stage("checking stage 1") { 
        echo "checking stage 1 Checked ${name}"
    }
}

def calling2(Map config = [:]) {
    stage("checking stage 2") {
        echo "checking stage 2 Checked ${name}"
    }
}

def getThingList() {
    return ["thing","thin2","thing3"]
}

def task(){
    thing = new getThing()
    println thing.getThingList()
}
