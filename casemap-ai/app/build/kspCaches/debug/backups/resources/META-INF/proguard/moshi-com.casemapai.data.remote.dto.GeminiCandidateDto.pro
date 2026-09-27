-if class com.casemapai.data.remote.dto.GeminiCandidateDto
-keepnames class com.casemapai.data.remote.dto.GeminiCandidateDto
-if class com.casemapai.data.remote.dto.GeminiCandidateDto
-keep class com.casemapai.data.remote.dto.GeminiCandidateDtoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.casemapai.data.remote.dto.GeminiCandidateDto
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.casemapai.data.remote.dto.GeminiCandidateDto
-keepclassmembers class com.casemapai.data.remote.dto.GeminiCandidateDto {
    public synthetic <init>(com.casemapai.data.remote.dto.GeminiContentResponseDto,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
