<template>
    <v-card outlined>
        <v-card-title>
            CheckWeather
        </v-card-title>

        <v-card-text>
            <String label="WeatherId" v-model="value.weatherId" :editMode="editMode"/>
            <String label="Location" v-model="value.location" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="checkWeather"
            >
                CheckWeather
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CheckWeatherCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.weatherId = '';
            this.value.location = '';
        },
        watch: {
        },
        methods: {
            checkWeather() {
                this.$emit('checkWeather', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

