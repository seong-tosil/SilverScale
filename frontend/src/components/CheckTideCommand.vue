<template>
    <v-card outlined>
        <v-card-title>
            CheckTide
        </v-card-title>

        <v-card-text>
            <String label="TideId" v-model="value.tideId" :editMode="editMode"/>
            <String label="Location" v-model="value.location" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="checkTide"
            >
                CheckTide
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
        name: 'CheckTideCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.tideId = '';
            this.value.location = '';
        },
        watch: {
        },
        methods: {
            checkTide() {
                this.$emit('checkTide', this.value);
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

