def call(Map config = [:]) {
    echo "checking stage 1 Checked"
}

def calling(Map config = [:]) {
    echo "checking stage 2 Checked"
}

def calling1(Map config = [:]) {
    stage("checking stage 1") { 
        echo "checking stage 1 Checked"
    }
}

def calling2(Map config = [:]) {
    stage("checking stage 2") {
        echo "checking stage 2 Checked"
    }
}
