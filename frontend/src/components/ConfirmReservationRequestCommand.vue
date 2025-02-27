<template>
    <v-card outlined>
        <v-card-title>
            ConfirmReservationRequest
        </v-card-title>

        <v-card-text>
            <String label="BookingId" v-model="value.bookingId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="confirmReservationRequest"
            >
                ConfirmReservationRequest
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
        name: 'ConfirmReservationRequestCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.bookingId = '';
        },
        watch: {
        },
        methods: {
            confirmReservationRequest() {
                this.$emit('confirmReservationRequest', this.value);
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

