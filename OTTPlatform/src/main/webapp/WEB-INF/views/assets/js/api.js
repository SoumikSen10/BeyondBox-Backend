'use strict'

const api_key='db7d80ebd3173b5aae336582dd7bffdd';
const imageBaseUrl='https://image.tmdb.org/t/p/';

// fecth data from a server using url and passes the result in json data to callback function along with an optional parameter if has optionalparam

const fetchDataFromServer=function(url,callback,optionalparam){
    fetch(url)
        .then(response => response.json())
        .then(data => callback(data,optionalparam));
}

export {imageBaseUrl,api_key,fetchDataFromServer}; 