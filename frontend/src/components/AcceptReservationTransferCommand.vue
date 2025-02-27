<template>
    <v-card outlined>
        <v-card-title>
            AcceptReservationTransfer
        </v-card-title>

        <v-card-text>
            <String label="TransferId" v-model="value.transferId" :editMode="editMode"/>
            <String label="BookingId" v-model="value.bookingId" :editMode="editMode"/>
            <String label="TransferType" v-model="value.transferType" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="acceptReservationTransfer"
            >
                AcceptReservationTransfer
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
        name: 'AcceptReservationTransferCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.transferId = '';
            this.value.bookingId = '';
            this.value.transferType = '';
        },
        watch: {
        },
        methods: {
            acceptReservationTransfer() {
                this.$emit('acceptReservationTransfer', this.value);
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

