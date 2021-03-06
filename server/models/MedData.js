var mongoose = require('mongoose');

var medDataSchema = new mongoose.Schema({
    'drug-name': {
        type: String
    },
    'side-effects': {
        type: String
    },
    'dosage': {
        type: String
    },
    'when-ntb-taken': {
        type: String
    }
})

var MedData = mongoose.model('MedData', medDataSchema);

module.exports = MedData;