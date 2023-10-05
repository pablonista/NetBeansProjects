export const API_RM = {
    URL: "https://rickandmortyapi.com/api",

    CHARATERS: function(){
        return`${this.URL}/character`
    },
    CHARACTER_BY_ID: function(id){
        return`${this.URL}/character/${id}`
    }
}