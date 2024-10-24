const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootil05r/",
            name: "springbootil05r",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootil05r/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "靓车汽车销售网站"
        } 
    }
}
export default base
