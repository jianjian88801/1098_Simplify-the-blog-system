const base = {
    get() {
        return {
            url : "http://localhost:8080/jingjianbokexitong/",
            name: "jingjianbokexitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jingjianbokexitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "精简博客系统"
        } 
    }
}
export default base
