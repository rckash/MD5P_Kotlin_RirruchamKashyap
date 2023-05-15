package kotlinoop.activities.activity04b

data class AudioVideoRecording (
    var isAudioRecording: Boolean,
    var isVideoRecording: Boolean,
    var length: Int,
    var dateRecorded: Int,
    var title: String,
    var publisher: String
)