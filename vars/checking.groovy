name = "sharif"

def call(Map config = [:]) {
    stages {
        stage('Building Distributable Package') {
            steps {
                echo 'Building'
            }
        }
    }
}

def calling(Map config = [:]) {
    stage('Building Distributable Package') {
        steps {
            echo 'Building'
        }
    }
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
