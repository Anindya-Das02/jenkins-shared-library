def executeMaven(String goal){
    echo "executing mavel goal: ${goal}"
    sh "mvn ${goal}"
}