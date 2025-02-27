<template>
    <v-card outlined>
        <v-card-title>
            MakeReservation
        </v-card-title>

        <v-card-text>
            <String label="BookingId" v-model="value.bookingId" :editMode="editMode"/>
            <String label="ShipId" v-model="value.shipId" :editMode="editMode"/>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="makeReservation"
            >
                MakeReservation
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
        name: 'MakeReservationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.bookingId = '';
            this.value.shipId = '';
            this.value.userId = '';
        },
        watch: {
        },
        methods: {
            makeReservation() {
                this.$emit('makeReservation', this.value);
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

