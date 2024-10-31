import axios from "axios";

export const ListaF = axios.create({
    baseURL:"http://localhost:8080/food",
})

