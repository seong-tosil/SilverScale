
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import TransferReservationTransferManager from "./components/listers/TransferReservationTransferCards"
import TransferReservationTransferDetail from "./components/listers/TransferReservationTransferDetail"

import WeatherInfoWeatherManager from "./components/listers/WeatherInfoWeatherCards"
import WeatherInfoWeatherDetail from "./components/listers/WeatherInfoWeatherDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/transferReservations/transfers',
                name: 'TransferReservationTransferManager',
                component: TransferReservationTransferManager
            },
            {
                path: '/transferReservations/transfers/:id',
                name: 'TransferReservationTransferDetail',
                component: TransferReservationTransferDetail
            },

            {
                path: '/weatherInfos/weathers',
                name: 'WeatherInfoWeatherManager',
                component: WeatherInfoWeatherManager
            },
            {
                path: '/weatherInfos/weathers/:id',
                name: 'WeatherInfoWeatherDetail',
                component: WeatherInfoWeatherDetail
            },




    ]
})
